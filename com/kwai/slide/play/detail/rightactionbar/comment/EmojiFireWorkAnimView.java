package com.kwai.slide.play.detail.rightactionbar.comment.EmojiFireWorkAnimView;
import java.lang.Runnable;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.slide.play.detail.rightactionbar.comment.EmojiFireWorkAnimView$a;
import jl9.e;
import java.util.List;
import il9.e;
import android.graphics.Canvas;
import java.util.Iterator;
import il9.a;
import android.view.animation.AnimationUtils;
import android.os.Handler;
import a2.i0;
import android.view.ViewGroup;

public class EmojiFireWorkAnimView extends View implements Runnable	// class@00184a
{
    public final List b;
    public e c;
    public boolean d;
    public EmojiFireWorkAnimView$a e;
    public int f;
    public int g;
    public final int[] h;
    public ViewGroup i;
    public boolean j;
    public boolean k;

    public void EmojiFireWorkAnimView(Context p0){
       super(p0, null);
    }
    public void EmojiFireWorkAnimView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void EmojiFireWorkAnimView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       int[] ointArray = new int[2];
       this.h = ointArray;
       if (PatchProxy.applyVoid(null, this, EmojiFireWorkAnimView.class, "1")) {
       }else {
          this.e = new EmojiFireWorkAnimView$a(this);
          uArrayList.add(new e());
       }
       return;
    }
    public e getProvider(){
       return this.c;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, EmojiFireWorkAnimView.class, "9")) {
          return;
       }
       super.onAttachedToWindow();
       this.j = true;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, EmojiFireWorkAnimView.class, "10")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this);
       EmojiFireWorkAnimView tc = this.c;
       if (tc != null) {
          tc.f();
       }
       this.j = false;
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiFireWorkAnimView.class, "6")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       return;
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EmojiFireWorkAnimView.class, "2")) {
          return;
       }
       if (this.j == null) {
          return;
       }
       Iterator iterator = this.b.iterator();
       int i = 0;
       a uoa = null;
       while (iterator.hasNext()) {
          iterator.next().i(AnimationUtils.currentAnimationTimeMillis());
          uoa = 1;
       }
       if (uoa == null) {
          if (!PatchProxy.applyVoid(objArray, this, EmojiFireWorkAnimView.class, "4")) {
             for (; i < this.b.size(); i = i + 1) {
                this.b.get(i).g();
             }
             this.k = true;
             if (this.d != null) {
                this.e.sendEmptyMessageDelayed(3, 300);
             }
          }
          return;
       }else {
          i0.j0(this);
          i0.k0(this, this);
          return;
       }
    }
    public void setDetachOnFinish(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiFireWorkAnimView.class, "7")) {
          return;
       }
       this.d = true;
       this.i = p0;
       if (this.k != null) {
          this.e.sendEmptyMessageDelayed(3, 1000);
       }
       return;
    }
    public void setProvider(e p0){
       this.c = p0;
    }
}
