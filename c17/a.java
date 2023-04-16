package c17.a;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.c;
import c17.a$a;
import com.kwai.library.widget.popup.common.c$b;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.kwai.library.widget.compatimageview.CompatImageView;
import android.net.Uri;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.Button;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import d17.d;
import c17.c;

public final class a extends c implements View$OnClickListener	// class@0004c2
{

    public void a(a$a p0){
       super(p0);
    }
    public boolean L(){
       return false;
    }
    public void O(Bundle p0){
       a$a uoa;
       if (this.z() == null) {
          return;
       }
       ImageView imageView = this.z().findViewById(R.id.iv_icon);
       boolean b = 8;
       if (imageView != null) {
          uoa = this.b0();
          if (uoa.H != null && imageView instanceof CompatImageView) {
             imageView.setVisibility(0);
             imageView.setCompatImageUri(uoa.H);
          }else if(uoa.I != null){
             imageView.setVisibility(0);
             imageView.setImageDrawable(uoa.I);
          }else {
             imageView.setVisibility(b);
          }
       }
       View view = this.z();
       uoa = this.b0();
       TextView textView = view.findViewById(R.id.tv_text);
       TextView textView1 = view.findViewById(R.id.tv_subtext);
       textView.setText(uoa.J);
       if (!TextUtils.isEmpty(uoa.K)) {
          textView1.setText(uoa.K);
          textView.setMaxLines(1);
          textView1.setVisibility(0);
       }else {
          textView.setMaxLines(2);
       }
       Button uButton = this.z().findViewById(R.id.tv_button);
       if (uButton != null) {
          uButton.setVisibility(0);
          uoa = this.b0();
          a$a o = uoa.O;
          if (o != null) {
             uButton.setBackground(o);
          }
          if (!TextUtils.isEmpty(uoa.L)) {
             uButton.setVisibility(0);
             uButton.setText(uoa.L);
          }else {
             uButton.setVisibility(b);
          }
          uButton.setOnClickListener(this);
       }
       view = this.z().findViewById(R.id.iv_close);
       if (view != null) {
          if (this.b0().b0()) {
             b = 0;
          }
          view.setVisibility(b);
          view.setOnClickListener(this);
       }
       Iterator iterator = this.b0().S.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this);
       }
       return;
    }
    public a$a b0(){
       return this.b;
    }
    public void onClick(View p0){
       if (p0.getId() == 0x7f0a1509) {
          this.o();
          if (this.b0().G != null) {
             this.b0().G.b(p0);
          }
       }else if(p0.getId() == 0x7f0a4101){
          this.o();
          if (this.b0().G != null) {
             this.b0().G.a(p0);
          }
       }
       return;
    }
}
