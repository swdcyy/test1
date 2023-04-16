package com.yxcorp.gifshow.share.guide.mode.ShareFloatChecker$mDestChannels$1;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;

public final class ShareFloatChecker$mDestChannels$1 extends ArrayList	// class@001b96
{

    public void ShareFloatChecker$mDestChannels$1(){
       super();
       this.add("QQ");
       this.add("QZone");
       this.add("WECHAT");
       this.add("WECHAT_MOMENTS");
       this.add("WECHAT_WOW");
       this.add("WEIBO");
    }
    public final boolean contains(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareFloatChecker$mDestChannels$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String) {
          return this.contains(p0);
       }
       return false;
    }
    public boolean contains(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareFloatChecker$mDestChannels$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.contains(p0);
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, ShareFloatChecker$mDestChannels$1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public final int indexOf(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareFloatChecker$mDestChannels$1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 instanceof String) {
          return this.indexOf(p0);
       }
       return -1;
    }
    public int indexOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareFloatChecker$mDestChannels$1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.indexOf(p0);
    }
    public final int lastIndexOf(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareFloatChecker$mDestChannels$1.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 instanceof String) {
          return this.lastIndexOf(p0);
       }
       return -1;
    }
    public int lastIndexOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareFloatChecker$mDestChannels$1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.lastIndexOf(p0);
    }
    public final String remove(int p0){
       if (PatchProxy.isSupport(ShareFloatChecker$mDestChannels$1.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ShareFloatChecker$mDestChannels$1.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.removeAt(p0);
    }
    public final boolean remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareFloatChecker$mDestChannels$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String) {
          return this.remove(p0);
       }
       return false;
    }
    public boolean remove(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareFloatChecker$mDestChannels$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.remove(p0);
    }
    public String removeAt(int p0){
       if (PatchProxy.isSupport(ShareFloatChecker$mDestChannels$1.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ShareFloatChecker$mDestChannels$1.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.remove(p0);
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, ShareFloatChecker$mDestChannels$1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
}
