package androidx.core.widget.a;
import android.os.Build$VERSION;

public interface abstract a	// class@00072f
{
    public static final boolean a0;

    static {
       boolean b = (Build$VERSION.SDK_INT >= 27)? true: false;
       a.a0 = b;
    }
    int getAutoSizeMaxTextSize();
    int getAutoSizeMinTextSize();
    int getAutoSizeStepGranularity();
    int[] getAutoSizeTextAvailableSizes();
    int getAutoSizeTextType();
    void setAutoSizeTextTypeUniformWithConfiguration(int p0,int p1,int p2,int p3);
    void setAutoSizeTextTypeUniformWithPresetSizes(int[] p0,int p1);
    void setAutoSizeTextTypeWithDefaults(int p0);
}
