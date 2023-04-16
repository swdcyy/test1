package bpd.b0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import so7.d;
import bpd.a0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.google.gson.c;
import java.lang.String;
import com.google.gson.JsonElement;
import com.yxcorp.plugin.kwaitoken.model.TachTemplateDialogInfo;
import java.lang.Exception;
import apd.i;
import apd.j;
import bpd.c0;
import java.util.Map;
import java.util.HashMap;

public class b0 extends PresenterV2 implements g	// class@00029a
{
    public FrameLayout p;
    public final d q;
    public TachTemplateDialogInfo r;
    public i s;
    public a t;

    public void b0(d p0){
       super();
       this.t = new a0(this);
       this.q = p0;
    }
    public void E8(){
       if (this.getContext() != null) {
          b0 tq = this.q;
          if (tq != null) {
             this.p.addView(tq.a());
             tq = this.q;
             Object[] objArray = new Object[1];
             JsonObject jsonObject = new JsonObject();
             JsonElement jsonElement = new c().a("tachikoma.sharelib.initData");
             try{
                jsonObject.G("action", jsonElement);
                jsonObject.G("data", this.r.mTachTemplateContent);
             }catch(java.lang.Exception e4){
                e4.printStackTrace();
                this.P8();
             }
             objArray[0] = jsonObject.toString();
             tq.setData(objArray);
          }
       }else {
          this.P8();
       }
       return;
    }
    public final void P8(){
       b0 ts = this.s;
       if (ts != null) {
          ts.j();
          this.s = null;
       }
       return;
    }
    public void doBindView(View p0){
       this.p = j.b(p0, 0x7f0a36a4);
    }
    public Object getObjectByTag(String p0){
       if (p0.equals("injector")) {
          return new c0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap hashMap = new HashMap();
       if (p0.equals("injector")) {
          hashMap.put(b0.class, new c0());
       }else {
          hashMap.put(b0.class, null);
       }
       return hashMap;
    }
}
