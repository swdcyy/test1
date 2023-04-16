package com.kwai.plugin.dva.repository.model.ComponentInfo;
import java.lang.Object;
import java.util.ArrayList;

public class ComponentInfo	// class@001377
{
    public List activities;
    public String application;
    public List broadcasts;
    public List contentProviders;
    public List services;

    public void ComponentInfo(){
       super();
       this.activities = new ArrayList();
       this.services = new ArrayList();
       this.broadcasts = new ArrayList();
       this.contentProviders = new ArrayList();
    }
}
