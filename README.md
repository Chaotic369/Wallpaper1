# Web Wallpaper Engine

An Android Live Wallpaper app to set Web pages, local HTML, or videos as your background.

## Build Instructions

This project is built using standard Android tooling and Gradle.

### Generating a Keystore for GitHub Actions
1. `keytool -genkey -v -keystore my-release-key.jks -keyalg RSA -keysize 2048 -validity 10000 -alias my-alias`
2. Encode to base64: `base64 my-release-key.jks > keystore_b64.txt`
3. Add secrets to GitHub repo (`KEYSTORE_BASE64`, `KEYSTORE_PASSWORD`, `KEY_ALIAS`, `KEY_PASSWORD`).

### Sideloading
Download the artifact from the GitHub Actions tab, transfer to device, and install the `.apk`.
