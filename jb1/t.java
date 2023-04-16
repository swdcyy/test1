package jb1.t;
import android.content.DialogInterface$OnClickListener;
import jb1.s$c;
import java.util.List;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import mz6.b$d;
import db1.a;
import eb1.a;
import java.lang.String;
import jb1.s;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import bb1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import k2b.u1;

public final class t implements DialogInterface$OnClickListener	// class@002b23
{
    public final s$c b;
    public final List c;

    public void t(s$c p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       JsonObject jsonObject;
       ClientContent$ContentPackage uContentPack;
       ClientContentWrapper$ContentWrapper uContentWrap;
       t tb = this.b;
       t tc = this.c;
       Objects.requireNonNull(tb);
       if (p1 >= 0 && p1 < tc.size()) {
          b$d uod = tc.get(p1);
          if (uod.b() instanceof a) {
             a uoa = uod.b();
             uoa.c().run();
             String str = uoa.a();
             int i = uoa.b();
             s$c y = tb.y;
             s b = y.B;
             s c = y.C;
             s d = y.D;
             ClientEvent$ElementPackage obj = null;
             ClientContent$LiveStreamPackage liveStreamPa = (d != null)? d.a(): obj;
             f uof = f.class;
             if (PatchProxy.isSupport(uof)) {
                Object[] objArray = new Object[]{str,Integer.valueOf(p1),Integer.valueOf(i),b,c,liveStreamPa};
                if (!PatchProxy.applyVoid(objArray, obj, uof, "5")) {
                }
             }else {
             }
          }
       }
    label_00b5 :
       return;
    }
}
