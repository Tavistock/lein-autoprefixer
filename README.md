# lein-autoprefixer

[![Clojars Project](https://img.shields.io/clojars/v/lein-autoprefixer.svg)](https://clojars.org/lein-autoprefixer)

A Leiningen plugin to use [Autoprefixer](https://github.com/postcss/autoprefixer).

## Usage

Add this to your project.clj `:plugins` and make sure `autoprefixer` and `postcss-cli` available on the command line.

Options for this plugin are a `:src` to the path of the css folder and an optional `:browsers` using the [browserslist format](https://github.com/browserslist/browserslist):

``` clojure
:autoprefixer {:src "resources/public/css"
               ;; optional
               :browsers "> 1%, Last 2 versions"}

```

Then run the command:

    $ lein autoprefixer
    
Or make an alias in your project.clj, this runs sass then autoprefixer:

```
:aliases {"cssbuild" ["do" ["sass" "once"] "autoprefixer"]}
```

## License

Copyright © 2019

Distributed under the Eclipse Public License version 1.0.
