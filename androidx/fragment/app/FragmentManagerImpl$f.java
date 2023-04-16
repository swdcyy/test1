package androidx.fragment.app.FragmentManagerImpl$f;
import androidx.fragment.app.b;
import androidx.fragment.app.FragmentManagerImpl;
import java.lang.ClassLoader;
import java.lang.String;
import androidx.fragment.app.Fragment;
import android.content.Context;
import androidx.fragment.app.FragmentHostCallback;
import android.os.Bundle;
import k2.a;

public class FragmentManagerImpl$f extends b	// class@000789
{
    public final FragmentManagerImpl b;

    public void FragmentManagerImpl$f(FragmentManagerImpl p0){
       this.b = p0;
       super();
    }
    public Fragment a(ClassLoader p0,String p1){
       FragmentManagerImpl mHost = this.b.mHost;
       return mHost.instantiate(mHost.getContext(), p1, null);
    }
}
