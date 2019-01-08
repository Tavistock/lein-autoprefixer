# lein-autoprefixer

A Leiningen plugin to use [Autoprefixer](https://github.com/postcss/autoprefixer).

## Usage

You must have `autoprefixer` and `postcss-cli` installed via `lein-npm` or `:npm-deps`'.

Put `[lein-autoprefixer "0.1.0"]` into the `:plugins` vector of your project.clj.

In your project.clj set the `:src`` to the path of the css and an optional `:browser` using the [browserslist format](https://github.com/browserslist/browserslist):

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

Copyright © 2019 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
