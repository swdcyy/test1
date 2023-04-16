package com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.MusicBubbleViewBinder$b;
import voc.s;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.MusicBubbleViewBinder;
import java.lang.Object;
import ooc.g;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import voc.r;
import android.view.View;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.Window;
import android.app.Activity;
import android.widget.Button;

public final class MusicBubbleViewBinder$b implements s	// class@0010e2
{
    public final MusicBubbleViewBinder a;

    public void MusicBubbleViewBinder$b(MusicBubbleViewBinder p0){
       this.a = p0;
       super();
    }
    public g a(){
       return EditorItemFunc.MUSIC_V2;
    }
    public void b(Music p0,int p1,String p2){
       r.g(this, p0, p1, p2);
    }
    public void c(int p0){
       r.d(this, p0);
    }
    public void d(boolean p0){
       r.f(this, p0);
    }
    public void e(){
       r.a(this);
    }
    public void f(View p0,List p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MusicBubbleViewBinder$b.class, "1")) {
          return;
       }
       a.p(p1, "recyclerViews");
       a.p(p2, "itemModelList");
       MusicBubbleViewBinder$b ta = this.a;
       ta.b = p0;
       ta.c = p1;
       Window window = ta.h.getWindow();
       a.o(window, "requireActivity.window");
       window = window.getDecorView().findViewById(0x1020002);
       a.o(window, "requireActivity.window.d¡­yId\(android.R.id.content\)");
       p1.d = window.findViewById(0x7f0a3074);
       return;
    }
    public void g(boolean p0){
       r.h(this, p0);
    }
    public void h(){
       r.b(this);
    }
}
