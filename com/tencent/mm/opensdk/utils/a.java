package com.tencent.mm.opensdk.utils.a;
import android.provider.BaseColumns;
import java.lang.String;
import android.net.Uri;

public final class a implements BaseColumns	// class@000f20
{
    public static final Uri a;

    static {
       a.a = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
    }
}
