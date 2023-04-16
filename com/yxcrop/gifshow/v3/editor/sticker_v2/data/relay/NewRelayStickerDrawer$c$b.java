package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$c$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;

public final class NewRelayStickerDrawer$c$b implements Runnable	// class@000a78
{
    public final VoteTextView b;

    public void NewRelayStickerDrawer$c$b(VoteTextView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewRelayStickerDrawer$c$b.class, "1")) {
          return;
       }
       NewRelayStickerDrawer$c$b tb = this.b;
       tb.setSelection(tb.length());
       return;
    }
}
