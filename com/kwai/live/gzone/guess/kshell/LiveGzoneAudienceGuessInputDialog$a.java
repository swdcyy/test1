package com.kwai.live.gzone.guess.kshell.LiveGzoneAudienceGuessInputDialog$a;
import xz6.a;
import com.kwai.live.gzone.guess.kshell.LiveGzoneAudienceGuessInputDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Integer;
import android.view.View;
import android.view.ViewGroup;
import pp.a;
import q87.c;
import i2b.a;
import android.widget.TextView;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public class LiveGzoneAudienceGuessInputDialog$a extends a	// class@000d23
{
    public boolean b;
    public final LiveGzoneAudienceGuessInputDialog c;

    public void LiveGzoneAudienceGuessInputDialog$a(LiveGzoneAudienceGuessInputDialog p0,boolean p1){
       this.c = p0;
       super();
       this.b = true;
       this.b = p1;
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAudienceGuessInputDialog$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.c.P.size() + 1);
    }
    public Object getItem(int p0){
       if (PatchProxy.isSupport(LiveGzoneAudienceGuessInputDialog$a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveGzoneAudienceGuessInputDialog$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Integer.valueOf(p0);
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       if (PatchProxy.isSupport(LiveGzoneAudienceGuessInputDialog$a.class)) {
          p1 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveGzoneAudienceGuessInputDialog$a.class, "3");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       Object[] objArray = new Object[0];
       a.C().s("GuessInputDialog", "Coin TextView getView", objArray);
       TextView textView = (this.b != null)? a.i(p2, R.layout.arg_RES_7f0d0bc3): a.i(p2, R.layout.arg_RES_7f0d0b47);
       if (p0 < this.c.P.size()) {
          textView.setText("+ "+this.c.P.get(p0));
       }else {
          textView.setText(R.string.arg_RES_7f1022e6);
       }
       return textView;
    }
}
