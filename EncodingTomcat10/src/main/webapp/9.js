post.addEventListener('click', () => fetch("servlet9", {
        method: 'POST',
        body: str.value
                // headers: { 'Content-Type': 'application/json' },
    }).then(r => r.text()).then(txt => response.innerHTML = txt));
 