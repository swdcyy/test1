package com.yxcorp.gifshow.growth.deeplink.model.DpRemoteIgnore;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class DpRemoteIgnore implements Serializable	// class@001360
{
    public List live;
    public List search;
    public List whiteList;
    public List work;
    public static final long serialVersionUID = 0xd83aab4de074a090;

    public void DpRemoteIgnore(){
       super();
       this.search = new ArrayList();
       this.live = new ArrayList();
       this.work = new ArrayList();
       this.whiteList = new ArrayList();
    }
}
