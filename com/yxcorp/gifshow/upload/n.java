package com.yxcorp.gifshow.upload.n;
import erd.o;
import java.lang.Object;
import njd.a;
import wkd.b;
import com.yxcorp.gifshow.helper.UserContactManager;
import com.yxcorp.gifshow.model.response.UsersResponse;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.helper.UserContactManager$UserContactItemCache;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserExtraInfo;
import com.yxcorp.gifshow.helper.UserContactManager$UserContactItem;
import com.yxcorp.gifshow.helper.UserContactManager$a;
import com.kwai.framework.cache.CacheManager;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import java.lang.reflect.Type;
import brd.t;
import qra.u;
import erd.g;
import java.lang.Iterable;
import com.yxcorp.gifshow.helper.k;
import com.yxcorp.gifshow.helper.j;
import erd.c;
import com.yxcorp.gifshow.helper.l;
import qra.v;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class n implements o	// class@001e93
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final Object apply(Object p0){
       User obj2;
       UserContactManager userContactM = b.a(-2042510349);
       UsersResponse usersRespons = p0.a();
       Objects.requireNonNull(userContactM);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UserContactManager userContactM1 = UserContactManager.class;
       if (PatchProxy.applyVoidOneRefs(usersRespons, userContactM, userContactM1, "4")) {
       }else {
          Object obj = null;
          ArrayList obj1 = PatchProxy.applyOneRefs(usersRespons, obj, userContactM1, "8");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else if(usersRespons == null || q.f(usersRespons.mUsers)){
             usersRespons = usersRespons.mUsers;
             obj1 = new ArrayList(usersRespons.size());
             Iterator iterator = usersRespons.iterator();
             while (iterator.hasNext()) {
                obj2 = iterator.next();
                User mExtraInfo = obj2.mExtraInfo;
                if (mExtraInfo != null && mExtraInfo.mContactName != null) {
                   UserContactManager$UserContactItem userContactI = new UserContactManager$UserContactItem(obj);
                   userContactI.mUserId = obj2.mId;
                   userContactI.mContactName = obj2.mExtraInfo.mContactName;
                   obj1.add(userContactI);
                }
             }
             if (obj1.size()) {
                UserContactManager$UserContactItemCache userContactI1 = new UserContactManager$UserContactItemCache(obj);
                userContactI1.mContactItems = obj1;
                obj = userContactI1;
             }
          }
          if (obj != null) {
             obj2 = b.a(0x5f2ddeb4);
             String str = "im_contacts_";
             obj1 = PatchProxy.applyOneRefs(str, userContactM, userContactM1, "9");
             String str1 = (obj1 != patchProxyRe)? obj1: str+QCurrentUser.me().getId();
             obj2.c(str1, obj, UserContactManager$UserContactItemCache.class, (System.currentTimeMillis() + UserContactManager.g));
             t ot = PatchProxy.applyOneRefs(obj, userContactM, userContactM1, "7");
             if (ot != patchProxyRe) {
             }else if(q.f(obj.mContactItems)){
                ot = t.just(userContactM.a).doOnNext(new u(userContactM));
             }else {
                ot = t.fromIterable(obj.mContactItems).flatMap(k.b, j.a).buffer(obj.mContactItems.size()).map(l.b).doOnNext(new v(userContactM));
             }
             ot.subscribe(Functions.d(), Functions.d());
          }
       }
       return p0;
    }
}
