package com.yxcorp.gifshow.hotinsert.HotInsertTypes;
import zva.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.android.model.feed.HotInsertFeed;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFragment;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zva.c;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.model.entity.HotInsertType;
import java.lang.IllegalStateException;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class HotInsertTypes implements a	// class@0018e1
{
    public ConcurrentHashMap mContractMap;
    public ConcurrentHashMap mTypeMap;

    public void HotInsertTypes(){
       super();
       this.mTypeMap = new ConcurrentHashMap();
       this.mContractMap = new ConcurrentHashMap();
    }
    public static void bindFragment(HotInsertTypes p0,HotInsertFeed p1,SlidePlayFragment p2,Bundle p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, HotInsertTypes.class, "6")) {
          return;
       }
       p0.getContract(p1).a(p2, p3);
       SerializableHook.putSerializable(p3, "KEY_FRAGMENT_HOT_INSERT_FEED_KEY_FRAGMENT_HOT_INSERT_FEED", p1);
       return;
    }
    public static SlidePlayFragment createFragment(HotInsertTypes p0,HotInsertFeed p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, HotInsertTypes.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getContract(p1).b(p1);
    }
    public static Integer getHotInsertType(HotInsertTypes p0,SlidePlayFragment p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, HotInsertTypes.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Bundle arguments = p1.getArguments();
       if (arguments == null) {
          return null;
       }
       try{
          HotInsertFeed serializable = SerializableHook.getSerializable(arguments, "KEY_FRAGMENT_HOT_INSERT_FEED_KEY_FRAGMENT_HOT_INSERT_FEED");
          if (serializable == null) {
             return null;
          }
          return p0.getType(serializable);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public final c getContract(HotInsertFeed p0){
       c obj = PatchProxy.applyOneRefs(p0, this, HotInsertTypes.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mContractMap.get(this.getInnerType(p0));
       if (obj != null) {
          return obj;
       }
       throw this.unRegisteredException(p0);
    }
    public final HotInsertType getInnerType(HotInsertFeed p0){
       return p0.mType;
    }
    public Integer getType(HotInsertFeed p0){
       Integer obj = PatchProxy.applyOneRefs(p0, this, HotInsertTypes.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mTypeMap.get(this.getInnerType(p0));
       if (obj != null) {
          return obj;
       }
       throw this.unRegisteredException(p0);
    }
    public boolean isRegistered(HotInsertFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotInsertTypes.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mTypeMap.containsKey(this.getInnerType(p0));
    }
    public final IllegalStateException unRegisteredException(HotInsertFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotInsertTypes.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IllegalStateException(p0.toString()+"  is not registered");
    }
}
