package hy9.c;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.interestadjust.a;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo;
import qp7.x0;
import qp7.b;
import hy9.m;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.common.information.interestadjust.InterestWeight;
import java.lang.String;
import wkd.b;
import psb.c;
import fg6.a;
import com.google.gson.Gson;
import brd.t;
import crd.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import e17.i;

public final class c implements g	// class@002734
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       p0.mHasClick = true;
       tb.E().h(true);
       tb.n0(Boolean.TRUE);
       p0 = new ArrayList();
       p0.add(new InterestWeight(tb.u.mInterestAdjustSnackBarInfo.mInterestId, tb.z));
       Gson a = a.a;
       b.a(0x1e7ef171).m(a.q(p0)).subscribe();
       Log.g("InterestAdjustElement", "submitPositiveMessage = "+a.q(p0));
       i.d(R.style.arg_RES_7f11066a, tb.x);
    }
}
