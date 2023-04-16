package com.yxcorp.gifshow.share.OperationModelUtil;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import brd.t;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.OperationModel$c;
import com.yxcorp.gifshow.share.OperationModel$Type;
import com.yxcorp.gifshow.share.OperationModelUtil$buildImageModel$$inlined$build$lambda$1;
import msd.l;
import kotlin.jvm.internal.a;
import kotlin.text.Regex;
import java.lang.CharSequence;
import lnc.a1;
import com.kwai.framework.model.feed.BaseFeed;
import ekd.n0;
import com.kwai.framework.model.user.User;
import kp.r1;

public final class OperationModelUtil	// class@001b72
{
    public static final OperationModelUtil a;

    static {
       OperationModelUtil.a = new OperationModelUtil();
    }
    public void OperationModelUtil(){
       super();
    }
    public final OperationModel a(File p0,String p1,String p2,String p3,String p4,t p5){
       OperationModelUtil$buildImageModel$$inlined$build$lambda$1 obj;
       object oobject = p5;
       OperationModelUtil operationMod = OperationModelUtil.class;
       object oobject1 = null;
       int i = 1;
       if (PatchProxy.isSupport(operationMod)) {
          Object[] objArray = new Object[]{oobject1,p1,p2,p3,p4,oobject};
          obj = PatchProxy.apply(objArray, this, operationMod, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i1 = this;
       }
       OperationModel$c uoc = new OperationModel$c();
       uoc.n(OperationModel$Type.IMAGE);
       uoc.g = oobject1;
       uoc.d(oobject1);
       uoc.c(i);
       uoc.e(oobject);
       obj = new OperationModelUtil$buildImageModel$$inlined$build$lambda$1(null, p5, p2, p1, p4, p3);
       uoc.f(v9);
       return uoc.a();
    }
    public final String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationModelUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && (a.g(p0, "") || a.g(p0, "..."))) {
          p0 = a1.p(R.string.arg_RES_7f10156b);
          a.o(p0, "CommonUtil.string\(R.string.hug_all_life\)");
       }else {
          p0 = new Regex("\\s+").replace(p0, " ");
       }
       return p0;
    }
    public final String c(BaseFeed p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, OperationModelUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       obj = new Object[]{p0.getId()};
       String str = n0.a("kwai://live/play/%s", obj);
       a.o(str, "LocaleUSUtil.format\(\"kwa¡­/live/play/%s\", photo.id\)");
       return str;
    }
    public final String d(BaseFeed p0){
       String str;
       User obj = PatchProxy.applyOneRefs(p0, this, OperationModelUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       obj = r1.T1(p0);
       if (obj != null) {
          Object[] objArray = new Object[]{p0.getId(),obj.mId};
          str = n0.a("kwai://work/%s?userId=%s", objArray);
          a.o(str, "LocaleUSUtil.format\(\"kwa¡­=%s\", photo.id, user.mId\)");
       }else {
          Object[] objArray1 = new Object[]{p0.getId()};
          str = n0.a("kwai://work/%s", objArray1);
          a.o(str, "LocaleUSUtil.format\(\"kwai://work/%s\", photo.id\)");
       }
       return str;
    }
    public final String e(User p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, null, this, OperationModelUtil.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "user");
       int i = 0;
       Object[] objArray = new Object[1];
       String id = p0.getId();
       if (id == null) {
          id = "";
       }
       objArray[i] = id;
       id = n0.a("kwai://profile/%s", objArray);
       a.o(id, "LocaleUSUtil.format\(\"kwa\x20\x02ofile/%s\", user.id ?: \"\"\)\x00");
       return id;
    }
}
