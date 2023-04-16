package m90.a;
import android.view.View$OnClickListener;
import com.kuaishou.gifshow.kuaishan.ui.a;
import com.yxcorp.widget.selector.view.SelectShapeImageView;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t90.j;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import u80.e;
import java.lang.Throwable;
import w46.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a implements View$OnClickListener	// class@0025b9
{
    public final a b;
    public final SelectShapeImageView c;

    public void a(a p0,SelectShapeImageView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, a.class, "1")) {
       }else {
          tc.setSelected((tc.isSelected() ^ 1));
          boolean b = tc.isSelected();
          tb.h = b;
          j oj = j.class;
          if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, oj, "23")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             String str = "PRODUCE_NOT_REMIND";
             try{
                uElementPack.action2 = str;
                JSONObject jSONObject = new JSONObject();
                String str1 = (b)? "checked": "unchecked";
                jSONObject.put("status", str1);
                uElementPack.params = jSONObject.toString();
             }catch(org.json.JSONException e0){
                Object[] objArray = new Object[0];
                e.D().u("KSLogger", e0, objArray);
             }
             u1.u(1, uElementPack, null);
          }
       }
       return;
    }
}
