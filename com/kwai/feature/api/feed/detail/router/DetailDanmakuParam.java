package com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import java.io.Serializable;
import java.lang.Cloneable;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.NullPointerException;
import java.lang.CloneNotSupportedException;

public final class DetailDanmakuParam implements Serializable, Cloneable	// class@000e99
{
    public String forceDanmakuId;
    public Long forceDanmakuPosition;
    public boolean forceOpenDanmaku;
    public boolean openDanmakuPanel;
    public String openDanmakuSource;
    public int switchSupportType;
    public static final DetailDanmakuParam$a Companion;
    public static final long serialVersionUID;

    static {
       DetailDanmakuParam.Companion = new DetailDanmakuParam$a(null);
    }
    public void DetailDanmakuParam(){
       super();
    }
    public DetailDanmakuParam clone(){
       DetailDanmakuParam obj = PatchProxy.apply(null, this, DetailDanmakuParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          if (obj != null) {
          }else {
             throw new NullPointerException("null cannot be cast to non-null type com.kwai.feature.api.feed.detail.router.DetailDanmakuParam");
          }
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          obj = new DetailDanmakuParam();
       }
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
}
