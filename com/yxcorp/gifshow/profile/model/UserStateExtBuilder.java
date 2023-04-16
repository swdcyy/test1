package com.yxcorp.gifshow.profile.model.UserStateExtBuilder;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.a;
import java.util.Comparator;
import java.util.TreeMap;
import com.google.common.collect.Maps;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority;
import java.util.Map;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$b;

public class UserStateExtBuilder	// class@0013d6
{
    public final Map a;

    public void UserStateExtBuilder(){
       super();
       this.a = Maps.w(a.b);
    }
    public UserStateExtBuilder a(UserStateExtBuilder$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserStateExtBuilder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(UserStateExtBuilder$Priority.ACCOUNT_ABANDON, p0);
       return this;
    }
    public UserStateExtBuilder b(UserStateExtBuilder$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserStateExtBuilder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(UserStateExtBuilder$Priority.BANNED, p0);
       return this;
    }
    public UserStateExtBuilder c(UserStateExtBuilder$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserStateExtBuilder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(UserStateExtBuilder$Priority.BLACKED, p0);
       return this;
    }
    public UserStateExtBuilder d(UserStateExtBuilder$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserStateExtBuilder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(UserStateExtBuilder$Priority.BLACKED_BY_OWNER, p0);
       return this;
    }
    public UserStateExtBuilder e(UserStateExtBuilder$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserStateExtBuilder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(UserStateExtBuilder$Priority.FROZEN, p0);
       return this;
    }
    public Object f(User p0,UserProfile p1){
       Map$Entry uEntry;
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, UserStateExtBuilder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uEntry = obj.next();
          UserStateExtBuilder$c b = uEntry.getValue().b;
          if (uEntry.getKey().checked(p0, p1)) {
             if (b == null) {
                return uEntry.getValue().a;
             }
             if (b.test()) {
                break ;
             }
          }
       }
       return uEntry.getValue().a;
    }
    public UserStateExtBuilder g(UserStateExtBuilder$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserStateExtBuilder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(UserStateExtBuilder$Priority.NORMAL, p0);
       return this;
    }
    public UserStateExtBuilder h(UserStateExtBuilder$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserStateExtBuilder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(UserStateExtBuilder$Priority.PRIVACY, p0);
       return this;
    }
}
