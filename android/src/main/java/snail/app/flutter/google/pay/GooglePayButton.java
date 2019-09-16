package snail.app.flutter.google.pay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import io.flutter.Log;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformView;

public class GooglePayButton implements PlatformView {

    private final Context context;
    private final PluginRegistry.Registrar registrar;
    private View googlePayButton;

    GooglePayButton(Context context, PluginRegistry.Registrar registrar, int id) {
        this.context = context;
        this.registrar = registrar;
        googlePayButton = createGooglePayButton();
    }

    private View createGooglePayButton() {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(context.getResources().getIdentifier("googlepay_button", "layout", context.getPackageName()), null);
        return view;
    }

    @Override
    public View getView() {
        return googlePayButton;
    }

    @Override
    public void dispose() {
        googlePayButton = null;
    }
}