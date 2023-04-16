package com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel;
import ml8.d;
import androidx.fragment.app.Fragment;
import nnc.n;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$Status;
import r6b.d;
import nnc.r;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import nnc.d;
import java.lang.String;
import java.lang.Math;
import java.lang.Object;
import java.lang.Long;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import com.yxcorp.gifshow.util.DateUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.View;
import android.view.animation.TranslateAnimation;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel$c;
import android.view.animation.Animation$AnimationListener;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import nnc.k;
import android.view.View$OnClickListener;
import nnc.m;
import nnc.l;
import nnc.i;
import com.yxcorp.gifshow.util.audiorecord.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import android.content.res.Resources;
import android.app.Activity;
import com.yxcorp.gifshow.util.audiorecord.g;
import com.yxcorp.utility.n;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.util.audiorecord.d;
import com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable;
import nnc.p;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.StringBuilder;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$b;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$c;
import com.yxcorp.gifshow.util.audiorecord.a;
import com.yxcorp.gifshow.util.audiorecord.e;
import nnc.o;
import java.lang.CharSequence;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel$a;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel$b;
import android.view.View$OnKeyListener;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;

public class FragmentAudioRecordPanel extends Fragment implements d	// class@001f3e
{
    public View b;
    public View c;
    public View d;
    public View e;
    public ImageView f;
    public View g;
    public TextView h;
    public TextView i;
    public FragmentAudioRecorder j;
    public g k;
    public RecordButtonDrawable l;
    public boolean m;
    public long n;
    public d o;
    public File p;
    public long q;
    public a r;
    public static final int s;

    public void FragmentAudioRecordPanel(){
       super();
       this.m = true;
       this.n = -1;
       this.r = new n(this);
    }
    public void Ug(){
       FragmentAudioRecordPanel tj = this.j;
       FragmentAudioRecorder$Status sTOP = FragmentAudioRecorder$Status.STOP;
       if (tj.n == sTOP) {
       }else {
          tj.n = sTOP;
          tj.h.stopRecording();
          tj.e.execute(new r(tj));
       }
       tj = this.o;
       if (tj != null) {
          tj.onCancel();
       }
       this.dismiss();
       return;
    }
    public String Vg(long p0){
       p0 = (long)Math.ceil((double)(p0 / 1000));
       long l = p0 / 3600;
       p0 = p0 - (3600 * l);
       long l1 = p0 / 60;
       p0 = p0 - (60 * l1);
       int i = 0;
       if (l > 0) {
          Object[] objArray = new Object[]{Long.valueOf(l),Long.valueOf(l1),Long.valueOf(p0)};
          return String.format("%d:%02d:%02d", objArray);
       }else {
          Object[] objArray1 = new Object[]{Long.valueOf(l1),Long.valueOf(p0)};
          return String.format("%02d:%02d", objArray1);
       }
    }
    public String Wg(long p0){
       String str = (this.getActivity() != null)? DateUtils.A(this.getActivity(), ((long)Math.ceil((double)(p0 / 1000)) * 1000)): "";
       return str;
    }
    public void dismiss(){
       AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
       uAlphaAnimat.setDuration(250);
       uAlphaAnimat.setFillAfter(true);
       this.c.startAnimation(uAlphaAnimat);
       TranslateAnimation translateAni = new TranslateAnimation(1, 0, 1, 0, 1, 0, 1, 0x3f800000);
       uAlphaAnimat.setDuration(250);
       uAlphaAnimat.setFillAfter(true);
       uAlphaAnimat.setAnimationListener(new FragmentAudioRecordPanel$c(this));
       this.b.startAnimation(uAlphaAnimat);
    }
    public void doBindView(View p0){
       this.b = m1.f(p0, 0x7f0a2f6f);
       this.c = m1.f(p0, 0x7f0a38b6);
       this.h = m1.f(p0, 0x7f0a3f01);
       this.e = m1.f(p0, 0x7f0a30c2);
       this.d = m1.f(p0, 0x7f0a096b);
       this.f = m1.f(p0, 0x7f0a0ead);
       this.i = m1.f(p0, 0x7f0a3ee1);
       this.g = m1.f(p0, 0x7f0a0a7e);
       m1.a(p0, new k(this), R.id.play_back);
       m1.a(p0, new m(this), R.id.control);
       m1.a(p0, new l(this), R.id.delete);
       m1.a(p0, new i(this), R.id.drop);
       m1.a(p0, new c(this), R.id.finish);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view = a.g(p0, R.layout.arg_RES_7f0d04a0, p1, false);
       this.doBindView(view);
       Resources resources = this.getActivity().getResources();
       g og = new g();
       this.k = og;
       og.a.setStrokeWidth((float)n.c(this.getActivity(), 3.00f));
       og.invalidateSelf();
       FragmentAudioRecordPanel tk = this.k;
       int color = resources.getColor(R.color.arg_RES_7f060c37);
       int i = 0x7f061f29;
       tk.a.setColor(color);
       tk.f = color;
       tk.h = resources.getColor(i);
       tk.g = resources.getColor(0x7f060be7);
       tk.invalidateSelf();
       this.d.setBackgroundDrawable(this.k);
       view.setOnClickListener(d.b);
       this.b.setOnClickListener(d.b);
       Drawable drawable = resources.getDrawable(R.drawable.arg_RES_7f080f5f);
       int color1 = resources.getColor(R.color.arg_RES_7f060c37);
       RecordButtonDrawable recordButton = new RecordButtonDrawable(drawable, color1, resources.getColor(i));
       this.l = recordButton;
       recordButton.s = new p(this);
       this.d.setImageDrawable(recordButton);
       this.d.setEnabled(false);
       FragmentAudioRecorder uFragmentAud = new FragmentAudioRecorder();
       this.j = uFragmentAud;
       uFragmentAud.b = PostUtils.g("[>|48|>]").getAbsolutePath();
       uFragmentAud.a = "record-"+this.hashCode()+".m4a";
       FragmentAudioRecordPanel tj = this.j;
       tj.k = this.n;
       tk = this.p;
       FragmentAudioRecordPanel tq = this.q;
       Objects.requireNonNull(tj);
       if (tk == null) {
       }else if(tj.c.size() <= 0){
          tj.c.add(new FragmentAudioRecorder$b(tk, tq));
          tj.m = tq;
          FragmentAudioRecorder f = tj.f;
          if (f != null) {
             f.c(1, tq, tq);
          }
       }else {
          throw new IllegalStateException("only one exist file valid");
       }
       tj.d = new e(this);
       tj.e = new o(this);
       this.i.setText(this.Vg(this.q));
       this.h.setVisibility(false);
       tj = this.h;
       Object[] objArray = new Object[]{this.Wg(this.n)};
       tj.setText(tj.getContext().getString(R.string.arg_RES_7f1002c3, objArray));
       tj = this.j;
       FragmentAudioRecordPanel$a uoa = new FragmentAudioRecordPanel$a(this);
       tj.f = uoa;
       uoa.f(tj.n);
       if (tj.c.size() > 0) {
          uoa.c(1, tj.c.get(false).b, tj.c.get(false).b);
       }
       view.setFocusable(1);
       view.setFocusableInTouchMode(1);
       view.setOnKeyListener(new FragmentAudioRecordPanel$b(this));
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.j.a().stop();
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this.r);
       }
       return;
    }
    public void onResume(){
       super.onResume();
       this.getView().requestFocus();
    }
    public void onViewCreated(View p0,Bundle p1){
       super.onViewCreated(p0, p1);
       AlphaAnimation uAlphaAnimat = new AlphaAnimation(0, 0x3f800000);
       uAlphaAnimat.setDuration(200);
       uAlphaAnimat.setFillBefore(true);
       this.c.startAnimation(uAlphaAnimat);
       TranslateAnimation translateAni = new TranslateAnimation(1, 0, 1, 0, 1, 0x3f800000, 1, 0);
       uAlphaAnimat.setDuration(250);
       this.b.startAnimation(uAlphaAnimat);
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this.r);
       }
       return;
    }
}
