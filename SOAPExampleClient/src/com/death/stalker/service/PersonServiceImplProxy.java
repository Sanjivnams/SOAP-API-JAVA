package com.death.stalker.service;

public class PersonServiceImplProxy implements com.death.stalker.service.PersonServiceImpl {
  private String _endpoint = null;
  private com.death.stalker.service.PersonServiceImpl personServiceImpl = null;
  
  public PersonServiceImplProxy() {
    _initPersonServiceImplProxy();
  }
  
  public PersonServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonServiceImplProxy();
  }
  
  private void _initPersonServiceImplProxy() {
    try {
      personServiceImpl = (new com.death.stalker.service.PersonServiceImplServiceLocator()).getPersonServiceImpl();
      if (personServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personServiceImpl != null)
      ((javax.xml.rpc.Stub)personServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.death.stalker.service.PersonServiceImpl getPersonServiceImpl() {
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl;
  }
  
  public com.death.stalker.beans.Person getPerson(int id) throws java.rmi.RemoteException{
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl.getPerson(id);
  }
  
  public boolean addPerson(com.death.stalker.beans.Person p) throws java.rmi.RemoteException{
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl.addPerson(p);
  }
  
  public boolean deletePerson(int id) throws java.rmi.RemoteException{
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl.deletePerson(id);
  }
  
  public com.death.stalker.beans.Person[] getAllPersons() throws java.rmi.RemoteException{
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl.getAllPersons();
  }
  
  
}