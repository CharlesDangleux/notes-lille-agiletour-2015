// The title of this document
title = "Notes AgileTour Lille 2015"

// The version of this document
version = "0.1"

// The path of source files directory
sourceDirectoryPath = "."

// The path of directory to be outputted a document
outputDirectoryPath = "build"

theme = "default"
layout = "main"
inputEncoding = "UTF-8"
outputEncoding = "UTF-8"
documentTocDepth = 4
pageTocDepth = 99
numbering = true
readmeToIndex = false

//Une solution de contournement pour pallier à ce qui semble être un bug dans Gaiden
filters = {
    all {
        afterTemplate = { text ->
            text.replaceAll(/<link rel="stylesheet" href="(\.\.\\){3}/, '<link rel="stylesheet" href="')
        }
    }
  }
