package a48.c;
import android.view.View$OnClickListener;
import com.mini.about.ui.AboutFragment;
import android.widget.TextView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import zi8.g1;
import java.lang.Math;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import zi8.p;
import zi8.c1;
import zi8.k;
import android.content.Context;
import android.content.ClipboardManager;
import android.content.ClipData;

public class c implements View$OnClickListener	// class@000027
{
    public final TextView b;
    public final AboutFragment c;

    public void c(AboutFragment p0,TextView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       c tc;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, str)) {
          return;
       }
       if (!TextUtils.isEmpty(this.b.getText())) {
          return;
       }
       int i = 0;
       if (Math.abs((g1.a() - this.c.c)) - 600 > 0) {
          tc = this.c;
          if (tc.b > null) {
             tc.b = i;
          }
       }
       this.c.c = g1.a();
       tc = this.c;
       int i1 = 1;
       int i2 = tc.b + i1;
       tc.b = i2;
       if (i2 == 6) {
          tc.b = i;
          FragmentActivity activity = tc.getActivity();
          if (activity == null) {
             return;
          }else {
             StringBuilder str1 = "";
             c tc1 = this.c;
             int i3 = 0x7f10357e;
             Object[] objArray = new Object[i1];
             AboutFragment d = tc1.d;
             String str2 = (d == null)? "": d.i;
             objArray[i] = str2;
             Object[] objArray1 = new Object[i1];
             objArray1[i] = c1.a(p.b());
             String str3 = str1+tc1.getString(i3, objArray)+"\n"+this.c.getString(0x7f10357f, objArray1);
             this.b.setText(str3);
             if (!PatchProxy.applyVoidTwoRefs(activity, str3, null, k.class, str)) {
                ClipboardManager systemServic = activity.getSystemService("clipboard");
                ClipData uClipData = ClipData.newPlainText("kwapp", str3);
                if (uClipData != null) {
                   systemServic.setPrimaryClip(uClipData);
                }
             }
          }
       }
       return;
    }
}
