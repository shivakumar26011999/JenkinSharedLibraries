def call(Map stageParams) {
    git branch: stageParams.branch, url: stageParams.url
}