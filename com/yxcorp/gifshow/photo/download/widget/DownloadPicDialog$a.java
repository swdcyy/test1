package com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import android.widget.Button;
import java.lang.StringBuilder;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import android.widget.ImageView;
import java.lang.Math;
import java.util.Map;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicButton;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import fxb.a;
import android.widget.TextView;

public class DownloadPicDialog$a implements ViewPager$i	// class@000f2d
{
    public final DownloadPicDialog b;

    public void DownloadPicDialog$a(DownloadPicDialog p0){
       this.b = p0;
       super();
    }
    public final void a(int p0){
       DownloadPicDialog$a uoa = DownloadPicDialog$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (p0 < 0) {
          this.b.u.setText(a.B.getString(R.string.arg_RES_7f100aa3));
       }else {
          int i = 100;
          if (p0 < i) {
             this.b.u.setText((a.B.getString(R.string.arg_RES_7f100aa1)).replace("%1$s", p0+""));
          }else if(p0 == i){
             this.b.u.setText(a.B.getString(R.string.arg_RES_7f100a9e));
          }
       }
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       DownloadPicDialog$a tb1;
       DownloadPicDialog$a uoa = DownloadPicDialog$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       int i = 1;
       p0 = p0 + i;
       DownloadPicDialog$a tb = this.b;
       tb.D = p0;
       if (tb.v != null && tb.s.getChildCount() > 0) {
          tb = this.b;
          tb.v.g(tb.s.getCurrentItem());
       }
       tb = this.b;
       DownloadPicDialog t = tb.t;
       int i1 = 0x7f0809fa;
       DownloadPicDialog$a uoa1 = 0x7f0807cf;
       int i2 = (tb.A != null)? 0x7f0809fa: 0x7f0807cf;
       t.setImageResource(i2);
       tb = this.b;
       int i3 = 0;
       if (tb.D == i) {
          i2 = Math.round((tb.Bh() * 100.00f));
          if (this.b.H != null) {
             this.b.L.put(Integer.valueOf(i), Integer.valueOf(i2));
          }else {
             int i4 = 100;
             if (i2 == i4) {
                this.b.L.put(Integer.valueOf(i), Integer.valueOf(i4));
             }else if(this.b.xh() && this.b.zh()){
                this.b.L.put(Integer.valueOf(i), Integer.valueOf(-1));
             }else if(this.b.xh() && !this.b.zh()){
                this.b.L.put(Integer.valueOf(i), Integer.valueOf(i3));
             }
          }
       }
       uoa = this.b;
       if (uoa.L.containsKey(Integer.valueOf(uoa.D))) {
          uoa = this.b;
          if (uoa.L.get(Integer.valueOf(uoa.D)) != null) {
             uoa = this.b;
             i = uoa.L.get(Integer.valueOf(uoa.D)).intValue();
          label_0100 :
             this.b.u.setDownloadPicProgress(i);
             if (this.b.yh(p0)) {
                tb1 = this.b;
                a.e("PHOTO_DOWNLOAD_IMAGE_DIALOG_ALL_BUTTON", tb1.O, tb1.P, tb1.uh(), this.b.C);
                if (!i) {
                   this.b.u.setText(a.B.getString(R.string.arg_RES_7f100aa5));
                }else {
                   this.a(i);
                }
                this.b.r.setText(a.B.getString(R.string.arg_RES_7f100aa2));
                this.b.t.setImageResource(i1);
                this.b.t.setVisibility(i3);
             }else if(this.b.Ah(p0)){
                tb1 = this.b;
                a.e("PHOTO_DOWNLOAD_IMAGE_DIALOG_LONG_BUTTON", tb1.O, tb1.P, tb1.uh(), this.b.C);
                if (!i) {
                   this.b.u.setText(a.B.getString(R.string.arg_RES_7f100aa6));
                }else {
                   this.a(i);
                }
                this.b.r.setText(a.B.getString(R.string.arg_RES_7f100aa0));
                this.b.t.setImageResource(uoa1);
                this.b.t.setVisibility(i3);
             }else {
                tb = this.b;
                a.e("PHOTO_DOWNLOAD_IMAGE_DIALOG_ONE_BUTTON", tb.O, tb.P, tb.uh(), this.b.C);
                if (!i) {
                   this.b.u.setText(a.B.getString(R.string.arg_RES_7f100aa4));
                }else {
                   this.a(i);
                }
                this.b.t.setVisibility(8);
                tb1 = this.b;
                this.b.r.setText((p0 - this.b.E)+"/"+(tb1.B - tb1.E));
             }
             return;
          }
       }
       i = 0;
       goto label_0100 ;
    }
}
