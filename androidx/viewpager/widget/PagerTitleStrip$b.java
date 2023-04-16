package androidx.viewpager.widget.PagerTitleStrip$b;
import android.text.method.SingleLineTransformationMethod;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.CharSequence;
import android.view.View;
import android.text.method.ReplacementTransformationMethod;
import java.lang.String;
import java.util.Locale;

public class PagerTitleStrip$b extends SingleLineTransformationMethod	// class@000a08
{
    public Locale b;

    public void PagerTitleStrip$b(Context p0){
       super();
       this.b = p0.getResources().getConfiguration().locale;
    }
    public CharSequence getTransformation(CharSequence p0,View p1){
       p0 = super.getTransformation(p0, p1);
       String str = (p0 != null)? (p0.toString()).toUpperCase(this.b): null;
       return str;
    }
}
