package com.kwai.framework.model.feed.BaseFeed;
import mkd.a;
import bw6.a;
import im8.g;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import java.util.UUID;
import java.lang.String;
import java.io.ObjectInputStream;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import ka6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ia6.c;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;

public abstract class BaseFeed extends SyncableProviderContainer implements a, a, g	// class@000bb8
{
    public final String mGrootId;
    public static final long serialVersionUID = 0x5bdf94f3ac5e7366;

    public void BaseFeed(){
       super();
       this.mGrootId = UUID.randomUUID().toString();
    }
    private void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFeed.class, "6")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, BaseFeed.class, "3")) {
          return;
       }
       b.b().c(this, BaseFeed.class);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof BaseFeed) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.n(this.getId(), p0.getId());
    }
    public final String getBizId(){
       Object obj = PatchProxy.apply(null, this, BaseFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getId();
    }
    public final String getGrootId(){
       BaseFeed tmGrootId = this.mGrootId;
       if (tmGrootId == null) {
          tmGrootId = "";
       }
       return tmGrootId;
    }
    public abstract String getId();
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseFeed.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BaseFeed.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(BaseFeed.class, new c());
       }else {
          obj.put(BaseFeed.class, null);
       }
       return obj;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, BaseFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getId() != null) {
          return (this.getId()).hashCode();
       }
       return super.hashCode();
    }
    public boolean isSame(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof BaseFeed) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.n(this.getGrootId(), p0.getGrootId());
    }
}
