import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/services.dart';

class GooglePayButton extends StatefulWidget {
  final VoidCallback onPressed;

  const GooglePayButton({Key key, this.onPressed}) : super(key: key);

  @override
  _GooglePayButtonState createState() => _GooglePayButtonState();
}

class _GooglePayButtonState extends State<GooglePayButton> {
  @override
  Widget build(BuildContext context) {
    if (defaultTargetPlatform == TargetPlatform.android) {
      return GestureDetector(
        behavior: HitTestBehavior.translucent,
        onTap: widget.onPressed,
        child: AndroidView(
          hitTestBehavior: PlatformViewHitTestBehavior.transparent,
          viewType: 'google_pay_button',
          creationParamsCodec: const StandardMessageCodec(),
        ),
      );
    }
    throw Exception(
        '$defaultTargetPlatform is not yet supported by this plugin');
  }
}
