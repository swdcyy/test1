package com.yxcorp.gifshow.music.cloudmusic.j;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$b;
import java.lang.Object;
import com.yxcorp.gifshow.widget.popup.a;
import java.util.Objects;
import lob.t0;
import k07.g;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.music.cloudmusic.i;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import lnc.a1;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;

public final class j implements b$b	// class@002021
{
    public final PostMusicTabHostFragment$b a;

    public void j(PostMusicTabHostFragment$b p0){
       this.a = p0;
    }
    public final void a(a p0){
       j ta = this.a;
       Objects.requireNonNull(ta);
       p0.t0(new t0(ta));
       p0.L(i.b);
       p0.C0((- a1.d(R.dimen.arg_RES_7f07030a)));
       p0.D0(BubbleInterface$Position.BOTTOM);
    }
}
