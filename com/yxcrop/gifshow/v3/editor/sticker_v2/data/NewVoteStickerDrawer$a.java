package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.CharSequence;

public class NewVoteStickerDrawer$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000a6c
{
    public final VoteTextView b;
    public final String c;
    public final int d;
    public final NewVoteStickerDrawer e;

    public void NewVoteStickerDrawer$a(NewVoteStickerDrawer p0,VoteTextView p1,String p2,int p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, NewVoteStickerDrawer$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.setText(this.c);
       this.e.layoutVoteContainer();
       this.e.addOptionTextChangeListener(this.b, this.d);
       return;
    }
}
