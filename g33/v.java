package g33.v;
import wgc.o;
import com.kuaishou.live.external.LiveSettingsActivity;
import java.lang.Object;
import xgc.e;
import com.yxcorp.gifshow.model.SelectOption;
import android.view.View;
import java.util.Iterator;
import java.util.ArrayList;
import wgc.c;
import xgc.i;
import wgc.d;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import oe6.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class v implements o	// class@002a60
{
    public final LiveSettingsActivity a;

    public void v(LiveSettingsActivity p0){
       this.a = p0;
    }
    public final void a(e p0,SelectOption p1,View p2){
       String str;
       v ta = this.a;
       Iterator iterator = ta.A.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc instanceof i) {
             uoc.b().i = false;
             uoc.h().f.findViewById(R.id.entry_checkout).setSelected(false);
          }
       }
       p0.i = true;
       p2.findViewById(R.id.entry_checkout).setSelected(true);
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putLong(b.d("user")+"live_background_play_minutes", (long)p1.mValue);
       g.a(uEditor);
       SelectOption mValue = p1.mValue;
       LiveSettingsActivity liveSettings = LiveSettingsActivity.class;
       if (!PatchProxy.isSupport(liveSettings) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mValue), ta, liveSettings, "11")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 1733;
          if (mValue == null) {
             str = "Close";
          }else if(mValue == LiveSettingsActivity.D){
             str = "Open";
          }else {
             str = String.valueOf(mValue);
          }
          uElementPack.name = str;
          u1.u(true, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
}
