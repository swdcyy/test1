package com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel$a;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$c;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel;
import java.lang.Object;
import com.yxcorp.gifshow.util.audiorecord.g;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Objects;
import com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable$State;
import com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable;
import com.yxcorp.gifshow.util.audiorecord.g$a;
import com.yxcorp.gifshow.util.audiorecord.g$b;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$Status;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel$d;
import java.lang.Enum;
import android.content.Context;
import java.io.File;
import nnc.d;

public class FragmentAudioRecordPanel$a implements FragmentAudioRecorder$c	// class@001f3a
{
    public final FragmentAudioRecordPanel a;

    public void FragmentAudioRecordPanel$a(FragmentAudioRecordPanel p0){
       this.a = p0;
       super();
    }
    public void a(int p0,long p1){
       FragmentAudioRecordPanel k = this.a.k;
       if (k.i == null && k.b.size()) {
          g b = k.b;
          b.remove((b.size() - 1));
          k.invalidateSelf();
       }
       k = this.a.f;
       int i = 0;
       int i1 = (p0 > 0)? 0: 4;
       k.setVisibility(i1);
       k = this.a.g;
       i1 = (p0 > 0)? 0: 4;
       k.setVisibility(i1);
       FragmentAudioRecordPanel$a ta = this.a;
       ta.i.setText(ta.Vg(p1));
       FragmentAudioRecordPanel e = this.a.e;
       int i2 = (p0 > 0)? 0: 4;
       e.setVisibility(i2);
       e = this.a.h;
       if (p0 > 0) {
          i = 4;
       }
       e.setVisibility(i);
       if (!p0) {
          FragmentAudioRecordPanel$a ta1 = this.a;
          ta1.m = true;
          FragmentAudioRecordPanel l = ta1.l;
          Objects.requireNonNull(l);
          l.c(RecordButtonDrawable$State.INIT);
       }
       return;
    }
    public void b(int p0){
       this.a.g.setSelected(false);
       this.a.k.c(false);
    }
    public void c(int p0,long p1,long p2){
       g$a uoa = this.a.k.a();
       uoa.a((((float)p1 * 100.00f) / (float)this.a.n));
       g$a c = uoa.c;
       c.i = null;
       uoa.c.b.add(new g$b(c, uoa.b, uoa.a));
       uoa.c.invalidateSelf();
       FragmentAudioRecordPanel$a ta = this.a;
       ta.i.setText(ta.Vg(p2));
       FragmentAudioRecordPanel f = this.a.f;
       int i = 0;
       int i1 = (p0 > 0)? 0: 4;
       f.setVisibility(i1);
       f = this.a.g;
       i1 = (p0 > 0)? 0: 4;
       f.setVisibility(i1);
       f = this.a.e;
       i1 = (p0 > 0)? 0: 4;
       f.setVisibility(i1);
       f = this.a.h;
       if (p0 > 0) {
          i = 4;
       }
       f.setVisibility(i);
       return;
    }
    public void d(int p0,long p1,long p2){
       this.a.k.a().a((((float)p1 * 100.00f) / (float)this.a.n));
       FragmentAudioRecordPanel$a ta = this.a;
       ta.i.setText(ta.Vg(p2));
    }
    public void e(int p0,long p1){
       this.a.g.setSelected(true);
       this.a.k.c(true);
    }
    public void f(FragmentAudioRecorder$Status p0){
       int i = FragmentAudioRecordPanel$d.a[p0.ordinal()];
       int i1 = 1;
       if (i != i1) {
          int i2 = 4;
          if (i != 2) {
             if (i != 3) {
                if (i == i2) {
                   this.a.d.setEnabled(false);
                }
             }else {
                this.a.d.setSelected(false);
                FragmentAudioRecordPanel h = this.a.h;
                Object[] objArray = new Object[i1];
                FragmentAudioRecordPanel$a ta = this.a;
                objArray[0] = ta.Wg(ta.n);
                h.setText(h.getContext().getString(R.string.arg_RES_7f1002c3, objArray));
                this.a.g.setEnabled(i1);
                this.a.e.setEnabled(i1);
                this.a.f.setEnabled(i1);
             }
          }else {
             this.a.d.setSelected(i1);
             this.a.h.setText(R.string.arg_RES_7f1002c2);
             this.a.h.setVisibility(false);
             this.a.g.setVisibility(i2);
             this.a.g.setEnabled(false);
             this.a.e.setSelected(false);
             this.a.e.setEnabled(false);
             this.a.e.setVisibility(i2);
             this.a.f.setEnabled(false);
             this.a.f.setVisibility(i2);
          }
       }else {
          this.a.d.setEnabled(i1);
       }
       return;
    }
    public void g(File p0,long p1){
       FragmentAudioRecordPanel o = this.a.o;
       if (o != null) {
          o.a(p0, p1);
       }
       this.a.dismiss();
       return;
    }
}
