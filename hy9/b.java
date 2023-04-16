package hy9.b;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.interestadjust.a;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo;
import qp7.x0;
import qp7.b;
import hy9.m;
import java.lang.CharSequence;
import e17.i;
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

public final class b implements g	// class@002733
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       p0.mHasClick = true;
       tb.E().h(true);
       tb.n0(Boolean.FALSE);
       i.d(R.style.arg_RES_7f11066a, tb.y);
       p0 = new ArrayList();
       p0.add(new InterestWeight(tb.u.mInterestAdjustSnackBarInfo.mInterestId, tb.A));
       Gson a = a.a;
       b.a(0x1e7ef171).m(a.q(p0)).subscribe();
       Log.g("InterestAdjustElement", "submitNegativeMessage = "+a.q(p0));
    }
}
