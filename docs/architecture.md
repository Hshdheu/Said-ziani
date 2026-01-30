Photo2Slides - Architecture

Modules:
- ui: Jetpack Compose screens (MainActivity, CreateProject, Editor)
- core: business logic models and managers
- video: FFmpegKit integration placeholders
- tts: interfaces for cloud/offline TTS
- storage: Room DB for projects and local media

Endpoints (backend - optional):
- POST /tts/generate
- POST /upload/sample
- POST /export

Privacy: Default local processing; cloud TTS only on user opt-in.
