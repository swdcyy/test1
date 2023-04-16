package com.yxcorp.gifshow.magic.data.db.MagicDBProvider$a;
import w2.c;
import a3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;

public final class MagicDBProvider$a extends c	// class@001b84
{

    public void MagicDBProvider$a(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicDBProvider$a.class, "1")) {
          return;
       }
       a.p(p0, "database");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `magicgroup` \(`businessId` INTEGER NOT NULL, `groupId` TEXT NOT NULL, `groupName` TEXT NOT NULL,`groupType` INTEGER NOT NULL,`groupPosition` INTEGER NOT NULL, PRIMARY KEY\(`businessId`, `groupId`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `magicemoji_brief` \(`businessId` INTEGER NOT NULL, `groupId` TEXT NOT NULL, `magicFaceId` TEXT NOT NULL,`magicPosition` INTEGER NOT NULL, PRIMARY KEY\(`businessId`, `groupId`, `magicFaceId`\)\)");
       Log.g("MagicFaceDao", "migrate MIGRATION_1_2");
       return;
    }
}
