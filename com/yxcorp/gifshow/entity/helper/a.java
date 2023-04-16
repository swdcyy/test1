package com.yxcorp.gifshow.entity.helper.a;
import erd.g;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import jga.f;
import com.yxcorp.gifshow.retrofit.tools.NonNullValueMap;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.response.FollowResponse;
import wca.p;
import com.kwai.robust.PatchProxyResult;
import lu7.f;
import com.yxcorp.gifshow.util.MemoryStorageUtil$Key;
import java.lang.Integer;
import com.yxcorp.gifshow.util.MemoryStorageUtil;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import kz6.f$a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import o56.c;
import o56.a;
import android.app.Application;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import wca.o;
import android.view.View$OnClickListener;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.entity.helper.b;
import kz6.a$b;
import kz6.f;
import android.app.Dialog;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import fg6.a;
import com.google.gson.Gson;
import java.util.Map;
import wca.l;

public final class a implements g	// class@000dd6
{
    public final boolean b;
    public final User c;
    public final User$FollowStatus d;
    public final f e;
    public final NonNullValueMap f;
    public final String g;

    public void a(boolean p0,User p1,User$FollowStatus p2,f p3,NonNullValueMap p4,String p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       User$FollowStatus uNFOLLOW;
       boolean b1;
       a uoa1;
       f$a a;
       a uoa = this;
       a b = uoa.b;
       a c = uoa.c;
       a d = uoa.d;
       a e = uoa.e;
       a f = uoa.f;
       a g = uoa.g;
       FollowResponse uFollowRespo = p0;
       p op = p.class;
       FollowResponse mFollowStatu = uFollowRespo.mFollowStatus;
       String str = null;
       int i = 1;
       int i1 = (mFollowStatu >= i)? 1: 0;
       if (i1 || b == null) {
          if (mFollowStatu != i) {
             uNFOLLOW = (mFollowStatu != 2)? User$FollowStatus.UNFOLLOW: User$FollowStatus.FOLLOW_REQUESTING;
          }else {
             uNFOLLOW = User$FollowStatus.FOLLOWING;
          }
          f.m(c, uNFOLLOW);
          MemoryStorageUtil.c(MemoryStorageUtil$Key.EUserFollowChanged, Integer.valueOf(i));
       }else {
          f.m(c, d);
       }
       Object[] objArray = null;
       if (uFollowRespo.mFollowStatus == null) {
          f$a obj = PatchProxy.apply(objArray, objArray, op, "2");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(SystemUtil.K() && i.c("KEY_H5_FOLLOW_SHOW_DEBUG_INFO")){
             str = 1;
          }
          b1 = str;
          if (b1 != null && !PatchProxy.applyVoidTwoRefs(uFollowRespo, e, objArray, op, "1")) {
             obj = new f$a(ActivityContext.g().e());
             ViewGroup viewGroup = LayoutInflater.from(a.a().a()).inflate(R.layout.arg_RES_7f0d05a0, objArray);
             String str2 = " url: "+e.o;
             str = " activityId: "+e.q;
             String str3 = " toUid: "+e.a.mId;
             String str4 = " traceCode: "+uFollowRespo.mTraceCode;
             uoa1 = g;
             String str5 = " fromUid: "+QCurrentUser.ME.getId();
             o oo = new o(str2, str, str3, str5, str4);
             viewGroup.findViewById(R.id.copy).setOnClickListener(uoa);
             viewGroup.findViewById(R.id.url_view).setText(str2);
             viewGroup.findViewById(R.id.activityId_view).setText(str);
             viewGroup.findViewById(R.id.toUid_view).setText(str3);
             viewGroup.findViewById(R.id.fromUid_view).setText(str5);
             viewGroup.findViewById(R.id.traceCode_view).setText(str4);
             obj.g("H5关注失败调试信息");
             a = obj.a;
             a.h = 0x7f0600a6;
             a.H = b.b;
             obj.h(viewGroup);
             obj.a().show();
          label_0171 :
             String str1 = PatchProxy.applyOneRefs(uFollowRespo, null, FollowHelper.class, "4");
             if (str1 != PatchProxyResult.class) {
             }else {
                str1 = a.a.q(uFollowRespo);
             }
             obj = str1;
             str1 = (b == null || i1)? 7: 8;
             l.c(obj, f, e, str1, b, uoa1);
             return;
          }
       }
    label_016f :
       uoa1 = g;
       goto label_0171 ;
    }
}
