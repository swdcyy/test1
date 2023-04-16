package kca.a;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import java.lang.Enum;

public final class a	// class@002c42
{
    public static final int[] a;

    static {
       int[] ointArray = new int[EditorFineTuningType.values().length];
       a.a = ointArray;
       ointArray[EditorFineTuningType.BRIGHTNESS_TYPE.ordinal()] = 1;
       ointArray[EditorFineTuningType.CONTRAST_TYPE.ordinal()] = 2;
       ointArray[EditorFineTuningType.SATURATION_TYPE.ordinal()] = 3;
       ointArray[EditorFineTuningType.SHARPEN_TYPE.ordinal()] = 4;
       ointArray[EditorFineTuningType.COLOR_TEMPERATURE_TYPE.ordinal()] = 5;
       ointArray[EditorFineTuningType.CLARITY_TYPE.ordinal()] = 6;
    }
}
