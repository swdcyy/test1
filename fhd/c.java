package fhd.c;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencilType;
import java.lang.Enum;

public final class c	// class@000e3c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SettingItemStencilType.values().length];
       c.a = ointArray;
       ointArray[SettingItemStencilType.BASIC.ordinal()] = 1;
       ointArray[SettingItemStencilType.OFFLINE.ordinal()] = 2;
    }
}
