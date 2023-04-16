package com.yxcorp.gifshow.profile.model.report.ReportElementPackage;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f3b.o;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage$Type;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage$Status;

public class ReportElementPackage implements Serializable	// class@0013dd
{
    public String action;
    public String action2;
    public int index;
    public String name;
    public String params;
    public String status;
    public String type;
    public double value;
    public static final long serialVersionUID = 0x7035fae02c431f51;

    public void ReportElementPackage(){
       super();
    }
    public static ReportElementPackage newInstance(ClientEvent$ElementPackage p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = null;
       ReportElementPackage obj1 = PatchProxy.applyOneRefs(p0, obj, ReportElementPackage.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new ReportElementPackage();
       ClientEvent$ElementPackage type = p0.type;
       if (PatchProxy.isSupport(o.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(type), obj, o.class, "16");
          if (obj != patchProxyRe) {
          label_0039 :
             obj1.type = obj;
             obj1.index = p0.index;
             obj1.name = TextUtils.k(p0.name);
             obj1.value = p0.value;
             obj1.status = o.g(ClientEvent$ElementPackage$Status.class, p0.status);
             obj1.action = o.l(p0.action);
             obj1.params = TextUtils.k(p0.params);
             obj1.action2 = TextUtils.k(p0.action2);
             return obj1;
          }
       }
       obj = o.g(ClientEvent$ElementPackage$Type.class, type);
       goto label_0039 ;
    }
}
