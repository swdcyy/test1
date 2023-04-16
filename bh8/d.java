package bh8.d;
import android.view.View$OnClickListener;
import bh8.m;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.mini.plcmanager.PlcModel;
import java.lang.Object;
import android.view.View;
import crd.b;
import fh8.d;
import ok.x;
import android.text.Editable;
import android.widget.EditText;
import java.lang.String;
import brd.t;
import bh8.i;
import bh8.h;
import erd.g;

public final class d implements View$OnClickListener	// class@000362
{
    public final m b;
    public final SlipSwitchButton c;
    public final PlcModel d;

    public void d(m p0,SlipSwitchButton p1,PlcModel p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       m j = tb.j;
       if (j != null && !j.isDisposed()) {
          tb.j.dispose();
       }
       boolean b = (tc != null)? tc.getSwitch(): false;
       tb.j = d.a.get().d(td.h, tb.e.getText().toString(), td.d, td.b, b).subscribe(new i(tb, td), new h(tb, td));
       return;
    }
}
