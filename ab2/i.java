package ab2.i;
import im8.g;
import k51.c;
import ab2.i$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.net.Uri;
import android.net.Uri$Builder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qm6.b$a;
import android.content.Context;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import qm6.b;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.t;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.f0;
import ab2.g;
import ab2.h;
import erd.g;
import crd.b;
import lnc.a1;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import ab2.l;
import java.util.Map;
import java.util.HashMap;

public class i extends c implements g	// class@0000a5
{
    public a0 p;
    public i$b q;
    public static String sLivePresenterClassName = "LiveStartEntryPresenter";

    public void i(){
       super();
       this.q = new i$a(this);
    }
    public void P8(long p0,String p1,String p2,String p3){
       Uri$Builder uBuilder;
       Uri$Builder uBuilder1;
       b$a uoa;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, p2, p3, this, i.class, "2")) {
          return;
       }
       if (this.p.N().r2(AudienceBizRelation.VOICE_PARTY_GUEST) || this.p.N().r2(AudienceBizRelation.CHAT)) {
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f102c96));
       }else {
          Activity activity = this.getActivity();
          if (PatchProxy.isSupport(oi)) {
             Object[] objArray = new Object[]{activity,Long.valueOf(p0),p1,p2,p3};
             if (!PatchProxy.applyVoid(objArray, this, oi, "3")) {
             }
          }else {
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new l());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       return;
    }
}
