package com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpGlobalCommonDataProcViewBinder;
import vd4.b;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpGlobalCommonDataProcViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpGlobalCommonDataProcViewBinder$onBind$1;
import kotlin.jvm.internal.a;
import msd.l;
import vd4.s$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class MtpGlobalCommonDataProcViewBinder extends b	// class@00091e
{
    public s$b y;
    public static final MtpGlobalCommonDataProcViewBinder$a z;

    static {
       MtpGlobalCommonDataProcViewBinder.z = new MtpGlobalCommonDataProcViewBinder$a(null);
    }
    public void MtpGlobalCommonDataProcViewBinder(Fragment p0){
       super(p0);
    }
    public void E8(){
       MtpGlobalCommonDataProcViewBinder mtpGlobalCom = MtpGlobalCommonDataProcViewBinder.class;
       if (PatchProxy.applyVoid(null, this, mtpGlobalCom, "2")) {
          return;
       }
       super.E8();
       MtpGlobalCommonDataProcViewBinder$onBind$1 oonBind$1 = new MtpGlobalCommonDataProcViewBinder$onBind$1(this);
       if (!PatchProxy.applyVoidTwoRefs("retentionMsg", oonBind$1, this, mtpGlobalCom, "5")) {
          mtpGlobalCom = this.y;
          if (mtpGlobalCom == null) {
             a.S("mGlobalDataDispatchService");
          }
          mtpGlobalCom.a("retentionMsg", oonBind$1);
       }
       return;
    }
    public void J8(){
       MtpGlobalCommonDataProcViewBinder mtpGlobalCom = MtpGlobalCommonDataProcViewBinder.class;
       if (PatchProxy.applyVoid(null, this, mtpGlobalCom, "3")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoidOneRefs("retentionMsg", this, mtpGlobalCom, "6")) {
          mtpGlobalCom = this.y;
          if (mtpGlobalCom == null) {
             a.S("mGlobalDataDispatchService");
          }
          mtpGlobalCom.c("retentionMsg");
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MtpGlobalCommonDataProcViewBinder.class, "1")) {
          return;
       }
       super.j8();
       this.y = this.r8("global_data_dispatch_svr");
       return;
    }
}
