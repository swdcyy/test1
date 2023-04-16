package bh8.i;
import erd.g;
import bh8.m;
import com.mini.plcmanager.PlcModel;
import java.lang.Object;
import com.mini.plcmanager.plc.response.LiveBizDataIdResponse;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.content.Intent;
import android.app.Application;
import zi8.p;
import org.json.JSONObject;
import com.mini.plcmanager.plc.ipc.MiniPlcParams;
import org.json.JSONException;
import n88.b;
import com.mini.host.HostPlcManager;
import android.net.Uri$Builder;
import java.lang.ref.WeakReference;
import android.app.Activity;

public final class i implements g	// class@000367
{
    public final m b;
    public final PlcModel c;

    public void i(m p0,PlcModel p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       Intent intent;
       JSONObject jSONObject;
       Uri$Builder uBuilder;
       Uri$Builder uBuilder1;
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 != null && !TextUtils.isEmpty(p0.bizDataId)) {
          PlcModel j = tc.j;
          PlcModel h = tc.h;
          PlcModel b = tc.b;
          PlcModel i = tc.i;
          p0 = p0.bizDataId;
          PlcModel d = tc.d;
          PlcModel l = tc.l;
          m om = m.class;
          if (PatchProxy.isSupport(om)) {
             Object[] objArray = new Object[]{Integer.valueOf(j),h,b,i,p0,d,l};
             if (!PatchProxy.applyVoid(objArray, tb, om, "10")) {
             }
          }else {
          }
       }else {
          tb.d(tc.j, tc.k, 0, 0);
       }
    label_00ce :
       return;
    }
}
