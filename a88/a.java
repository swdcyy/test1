package a88.a;
import android.view.View$OnClickListener;
import com.mini.codescan.CodeScanActivity;
import java.lang.Object;
import android.view.View;

public final class a implements View$OnClickListener	// class@000048
{
    public final CodeScanActivity b;

    public void a(CodeScanActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.finish();
    }
}
