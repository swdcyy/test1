package com.yxcorp.gifshow.homepage.kcube.m;
import on5.m$a;
import java.lang.String;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$TabBizParams;
import com.kwai.component.kcube.model.model.TabConfig;
import com.kwai.component.kcube.model.model.TabBizParams;
import java.lang.Object;
import zr6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.kcube.m$a;
import zr6.g;
import com.kwai.framework.model.channel.HotChannel;
import wn5.b;
import java.lang.Integer;
import lnc.u3;
import wq6.e;
import android.content.Intent;
import java.lang.Boolean;
import msa.b;
import android.net.Uri;
import java.util.List;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import on5.o;

public class m extends m$a	// class@00173f
{

    public void m(){
       super("ato_chl");
    }
    public boolean a(DynamicTabConfig p0){
       p0 = p0.mBizParams;
       boolean b = (p0 != null && p0.mHotChannel != null)? true: false;
       return b;
    }
    public boolean b(TabConfig p0){
       p0 = p0.mBizParams;
       boolean b = (p0 != null && p0.mHotChannel != null)? true: false;
       return b;
    }
    public b d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m$a(p0);
    }
    public void e(g p0){
       TabBizParams mHotChannel;
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       HotChannel obj = p0.f();
       b obj1 = null;
       if (obj instanceof HotChannel) {
          obj = p0.f();
       }else if(obj instanceof TabConfig){
          mHotChannel = obj.mBizParams.mHotChannel;
       }else if(obj instanceof DynamicTabConfig){
          DynamicTabConfig mBizParams = obj.mBizParams;
          if (mBizParams != null) {
             mHotChannel = mBizParams.mHotChannel;
          }
       }
       mHotChannel = obj1;
       if (obj != null) {
          int i = 0x7f101552;
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i), obj1, uob, "5");
             if (obj1 != PatchProxyResult.class) {
             label_0057 :
                p0.a("KEY_TAB_NAME_DEST", obj1).a("KEY_TAB_HOT_CHANNEL", obj).a("KEY_TAB_LAUNCH_ID", u3.a(obj.mId, "hot"));
             }
          }
          obj1 = new b(obj, i);
          goto label_0057 ;
       }
       return;
    }
    public boolean f(e p0,Intent p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.f(p0, p1)) {
          return b;
       }
       obj = b.class;
       Object obj1 = null;
       Object obj2 = PatchProxy.applyOneRefs(p1, obj1, obj, "1");
       if (obj2 != patchProxyRe) {
          obj1 = obj2;
       }else if(p1 == null){
          Uri data = p1.getData();
          obj2 = PatchProxy.applyOneRefs(data, obj1, obj, "2");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else if(data != null && (data.isHierarchical() && (("kwai").equals(data.getScheme()) && ("home").equals(data.getHost())))){
             Object obj3 = PatchProxy.applyTwoRefs(data, "channel", obj1, obj, "3");
             if (obj3 != patchProxyRe) {
                b1 = obj3.booleanValue();
             }else {
                List pathSegments1 = data.getPathSegments();
                b1 = (pathSegments1.size() > 0)? "channel".equals(pathSegments1.get(false)): false;
             }
             if (b1) {
                List pathSegments = data.getPathSegments();
                if (pathSegments.size() > b) {
                   obj1 = pathSegments.get(b);
                }
             }
          }
       }
       if (!TextUtils.n(p0.M2().getId(), obj1) && !TextUtils.n("29", obj1)) {
          b = false;
       }
       if (b) {
          o.a(obj1, false);
       }
       return b;
    }
}
