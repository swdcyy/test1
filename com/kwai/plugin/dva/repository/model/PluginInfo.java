package com.kwai.plugin.dva.repository.model.PluginInfo;
import java.lang.Object;
import java.util.ArrayList;

public class PluginInfo	// class@00137b
{
    public List activities;
    public String apkPath;
    public String application;
    public List broadcasts;
    public List contentProviders;
    public String dataDir;
    public DvaPluginConfig dvaPluginConfig;
    public String name;
    public String odexPath;
    public List services;
    public String soDir;
    public int version;

    public void PluginInfo(){
       super();
       this.activities = new ArrayList();
       this.services = new ArrayList();
       this.broadcasts = new ArrayList();
       this.contentProviders = new ArrayList();
    }
}
