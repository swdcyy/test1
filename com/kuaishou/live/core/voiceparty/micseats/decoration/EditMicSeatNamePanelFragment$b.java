package com.kuaishou.live.core.voiceparty.micseats.decoration.EditMicSeatNamePanelFragment$b;
import jz6.a;
import com.kuaishou.live.core.voiceparty.micseats.decoration.EditMicSeatNamePanelFragment;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.appcompat.widget.AppCompatEditText;
import android.view.View;
import a27.c;
import android.app.Dialog;

public final class EditMicSeatNamePanelFragment$b extends a	// class@001593
{
    public final EditMicSeatNamePanelFragment b;

    public void EditMicSeatNamePanelFragment$b(EditMicSeatNamePanelFragment p0,Context p1,int p2){
       this.b = p0;
       super(p1, p2);
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, EditMicSeatNamePanelFragment$b.class, "1")) {
          return;
       }
       c.d(EditMicSeatNamePanelFragment.xh(this.b));
       super.dismiss();
       return;
    }
}
