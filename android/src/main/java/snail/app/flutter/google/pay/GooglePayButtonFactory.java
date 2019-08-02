package snail.app.flutter.google.pay;

import android.content.Context;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

class GooglePayButtonFactory extends PlatformViewFactory {

    private final Registrar pluginRegistrar;

    public GooglePayButtonFactory(Registrar registrar) {
        super(StandardMessageCodec.INSTANCE);
        pluginRegistrar = registrar;
    }

    @Override
    public PlatformView create(Context context, int i, Object o) {
        return new GooglePayButton(context, pluginRegistrar, i);
    }
}