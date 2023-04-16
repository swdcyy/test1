package com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$Api24Utils;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import java.lang.Object;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a;
import java.io.FileDescriptor;
import android.media.ExifInterface;
import android.os.Build$VERSION;

public class LocalExifThumbnailProducer$Api24Utils	// class@00111e
{
    public final LocalExifThumbnailProducer a;

    public void LocalExifThumbnailProducer$Api24Utils(LocalExifThumbnailProducer p0){
       this.a = p0;
       super();
    }
    public void LocalExifThumbnailProducer$Api24Utils(LocalExifThumbnailProducer p0,LocalExifThumbnailProducer$a p1){
       super(p0);
    }
    public ExifInterface a(FileDescriptor p0){
       ExifInterface uExifInterfa = (Build$VERSION.SDK_INT >= 24)? new ExifInterface(p0): null;
       return uExifInterfa;
    }
}
