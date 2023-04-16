package a88.b;
import android.view.View$OnClickListener;
import com.mini.codescan.CodeScanActivity;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import java.lang.String;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.mini.codescan.a;
import erd.g;
import crd.b;

public final class b implements View$OnClickListener	// class@000049
{
    public final CodeScanActivity b;

    public void b(CodeScanActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       String[] stringArray = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
       tb.o = new g(tb).d(stringArray).observeOn(a.c()).subscribe(new a(tb));
    }
}
